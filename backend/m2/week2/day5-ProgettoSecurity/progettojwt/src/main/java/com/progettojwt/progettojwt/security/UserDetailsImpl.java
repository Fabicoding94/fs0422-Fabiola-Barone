package com.progettojwt.progettojwt.security;


import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.progettojwt.progettojwt.models.Utente;

import lombok.Data;

@Data
public class UserDetailsImpl implements UserDetails {
	private long id;
	private String username;
	private String email;
	@JsonIgnore
	private String password;
	private boolean accountNonLocked = true;
	private boolean accountNonExpired = false;
	private boolean credentialsNonExpired = true;
	private boolean enabled = true;
	private Date expirationTime;

	private Collection<? extends GrantedAuthority> authorities;

	public UserDetailsImpl(long id, String username, String email, String password,
			Collection<? extends GrantedAuthority> authorities) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.accountNonLocked = enabled;
		this.accountNonExpired = enabled;
		this.credentialsNonExpired = enabled;
		this.authorities = authorities;
	}

	public static UserDetailsImpl build(Utente user) {
		List<GrantedAuthority> authorities = user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getRuoloType().name()))
				.collect(Collectors.toList());
		return new UserDetailsImpl(user.getId(), user.getUsername(), user.getEmail(), user.getPassword(),
				authorities);
	}
}
