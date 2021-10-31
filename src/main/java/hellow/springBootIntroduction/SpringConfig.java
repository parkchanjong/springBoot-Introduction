package hellow.springBootIntroduction;

import hellow.springBootIntroduction.repository.JdbcMemberRepository;
import hellow.springBootIntroduction.repository.MemberRepository;
import hellow.springBootIntroduction.repository.MemoryMemberRepository;
import hellow.springBootIntroduction.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
    }
}
