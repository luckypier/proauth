package org.baeldung.userdb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "customer")
public class CustomerModel implements UserDetails {

    @Id
    private String id;

    private String nickname;

    private String names;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "second_lastname")
    private String secondLastName;

    private String dni;

    @Column(name = "codclavecic")
    private String cicKeyCode;

    @Column(name = "codunicocli")
    private String cic;

    private Boolean enabled;

    @Column(name = "profile_risk")
    private String profileRisk;

    @Column(name = "profile_risk_other")
    private String profileRiskOther;

    private String journey;

    @Column(name = "creation_time")
    private Date creationTime;

    @Column(name = "update_time")
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    private void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNames() {
        return names;
    }

    private void setNames(String names) {
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    private void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getDni() {
        return dni;
    }

    private void setDni(String dni) {
        this.dni = dni;
    }

    public String getCicKeyCode() {
        return cicKeyCode;
    }

    private void setCicKeyCode(String cicKeyCode) {
        this.cicKeyCode = cicKeyCode;
    }

    public String getCic() {
        return cic;
    }

    private void setCic(String cic) {
        this.cic = cic;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    private void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getProfileRisk() {
        return profileRisk;
    }

    private void setProfileRisk(String profileRisk) {
        this.profileRisk = profileRisk;
    }

    public String getProfileRiskOther() {
        return profileRiskOther;
    }

    private void setProfileRiskOther(String profileRiskOther) {
        this.profileRiskOther = profileRiskOther;
    }

    public String getJourney() {
        return journey;
    }

    private void setJourney(String journey) {
        this.journey = journey;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    private void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    private void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public CustomerModel withId(String id) {
        this.setId(id);
        return this;
    }

    public CustomerModel withNickname(String nickname) {
        this.setNickname(nickname);
        return this;
    }

    public CustomerModel withNames(String names) {
        this.setNames(names);
        return this;
    }

    public CustomerModel withLastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }

    public CustomerModel withSecondLastName(String secondLastName) {
        this.setSecondLastName(secondLastName);
        return this;
    }

    public CustomerModel withDni(String dni) {
        this.setDni(dni);
        return this;
    }

    public CustomerModel withCicKeyCode(String cicKeyCode) {
        this.setCicKeyCode(cicKeyCode);
        return this;
    }

    public CustomerModel withCic(String cic) {
        this.setCic(cic);
        return this;
    }

    public CustomerModel withProfileRisk(String profileRisk) {
        this.setProfileRisk(profileRisk);
        return this;
    }

    public CustomerModel withProfileRiskOther(String profileRiskOther) {
        this.setProfileRiskOther(profileRiskOther);
        return this;
    }

    public CustomerModel withJourney(String journey) {
        this.setJourney(journey);
        return this;
    }

    public CustomerModel withEnabled(Boolean enabled) {
        this.setEnabled(enabled);
        return this;
    }

    public CustomerModel withCreationTime(Date creationTime) {
        this.setCreationTime(creationTime);
        return this;
    }

    public CustomerModel withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }
    //last

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		return authorities;
	}

	@Override
	public String getPassword() {
		return this.getDni();
	}

	@Override
	public String getUsername() {
		return this.getDni();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return this.getEnabled();
	}

}
