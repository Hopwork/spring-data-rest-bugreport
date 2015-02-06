package com.hopwork.api.model.recommandation;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "recommandations")
public class Recommandation {

    private String id;
    private String recoText;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date recoTextUpdateDate;
    @JsonIgnore
    private String accountId;
    private String profileId;
    @JsonIgnore
    private boolean acceptedReco;

    public String getRecoText() {
        return recoText;
    }

    public Date getRecoTextUpdateDate() {
        return recoTextUpdateDate;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public boolean getAcceptedReco() {
        return acceptedReco;
    }

    public void setAcceptedReco(boolean acceptedReco) {
        this.acceptedReco = acceptedReco;
    }
}
