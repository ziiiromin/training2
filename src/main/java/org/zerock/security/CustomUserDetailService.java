package org.zerock.security;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.zerock.domain.CustomUser;
import org.zerock.domain.MemberVO;
import org.zerock.mapper.MemberMapper;

import jdk.internal.org.jline.utils.Log;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
 
@Log4j
public class CustomUserDetailService implements UserDetailsService {
 
    @Setter(onMethod_ = @Autowired)
    private MemberMapper memberMapper;
 
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    	log.warn("����� loadUserByUsername");
    	
        MemberVO vo = memberMapper.read(username);
        
//        log.warn("member mapper" + vo.getUserpw());
        
        return vo == null ? null : new CustomUser(vo);
    }
    
}