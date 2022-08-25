package com.axonactive.com.devmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgLanguageUnderstandingKey implements Serializable {
    @Column (name = "developer_id")
    Integer developerId;

    @Column (name = "progLanguage_id")
    Integer progLanguageId;
}
