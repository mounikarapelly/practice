package springbootsecurityjwt;

import java.util.ArrayList;
import java.util.Collection;


import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    	 return new User("foo", "foo",
                 new ArrayList<>());
    }

}
