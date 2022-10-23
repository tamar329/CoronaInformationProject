package com.example.CoronaInformProject.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    /**
     * Display the home page, with the list of members in the HMO.
     * @param model
     * @return home page, with the list of members in the HMO.
     */
    @GetMapping("/")
    public String getMembers(Model model){
        List<Member> membersList = memberService.getMembers();
        model.addAttribute("membersList", membersList);
        return "index";
    }

    /**
     * Display new member form.
     * @param model
     * @return new member form
     */
    @GetMapping("/showNewMemberForm")
    public String showNewMemberForm(Model model) {
        // create model attribute to bind form data
        Member member = new Member();
        model.addAttribute("member", member);
        return "new_member";
    }

    /**
     * Adds a new member to the HMO member database.
     * @param member
     * @param model
     * @return home page.
     */
    @PostMapping("/saveMember")
    public String addMember(@ModelAttribute("member") Member member, Model model){
        boolean memberSaved = memberService.addNewMember(member);
        if(memberSaved == false){
            model.addAttribute("errorMessage","Member with id exists");
            return "new_member";
        }
        return "redirect:/";
    }

    /**
     * Deletes the member in the HMO, whose ID was received.
     * @param id - ID of the member that needs to be deleted from the HMO database.
     * @param model
     * @return home page.
     */
    @GetMapping("/deleteMember/{id}")
    public String deleteStudent(@PathVariable("id") long id, Model model) {
        memberService.deleteMember(id);
        return "redirect:/";
    }

    /**
     * Display the form for update.
     * @param id - ID of the member whose details you want to update.
     * @param model
     * @return update form.
     */
    @GetMapping("/showFormForUpdate/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Member member = memberService.getMember(id);
        model.addAttribute("member", member);
        return "update_member";
    }

    /**
     * Save the changes of the HMO member.
     * @param member
     * @return home page.
     */
    @PostMapping("/saveUpdateMember")
    public String updateMember(@ModelAttribute("member") Member member){
        if (member.getPositiveResultDate() != null && member.getRecoveryDate() == null ||
                member.getPositiveResultDate() == null && member.getRecoveryDate() != null){
            return "redirect:/";
        }
        memberService.updateMember(member);
        return "redirect:/";
    }

    /**
     * Displaying a form of member information.
     * @param id - ID of the member's information that you want to displayץ
     * @param model
     * @return member details form.
     */
    @GetMapping("/showDetailsForm/{id}")
    public String showDetailsForm(@PathVariable("id") long id, Model model) {
        Member member = memberService.getMember(id);
        model.addAttribute("member", member);
        return "member_details";
    }
}