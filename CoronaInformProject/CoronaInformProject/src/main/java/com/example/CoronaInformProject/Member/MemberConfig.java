package com.example.CoronaInformProject.Member;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class MemberConfig {

    @Bean
    CommandLineRunner commandLineRunner(MemberRepository memberRepository) {
        return args -> {
            Member noga = new Member(
                    315555589L,
                    "Noga",
                    "Ilan",
                    "Jerusalem",
                    "Hoffman",
                    12,
                    LocalDate.of(2002, Month.DECEMBER, 12),
                    "025812377",
                    "0582386754",
                    LocalDate.of(2020, Month.NOVEMBER, 9),
                    LocalDate.of(2020, Month.NOVEMBER, 19),
                    LocalDate.of(2020, Month.NOVEMBER, 19),
                    "C",
                    LocalDate.of(2020, Month.NOVEMBER, 19),
                    "D",
                    LocalDate.of(2020, Month.NOVEMBER, 19),
                    "A",
                    LocalDate.of(2020, Month.NOVEMBER, 19),
                    "V"
            );

            Member shir = new Member(
                    333333333L,
                    "Shir",
                    "Ness",
                    "Jerusalem",
                    "Hoffman",
                    13,
                    LocalDate.of(1996, Month.DECEMBER, 12),
                    "025871577",
                    "0583233577",
                    LocalDate.of(2020, Month.NOVEMBER, 10),
                    LocalDate.of(1999, Month.NOVEMBER, 20),
                    LocalDate.of(2020, Month.NOVEMBER, 20),
                    "China",
                    null,
                    null,
                    null,
                    null,
                    null,
                    null
                    );

            memberRepository.saveAll(
                    List.of(noga, shir)
            );
        };


    }
}
