package com.axonactive.com.devmanagement.entity;

import javax.persistence.*;

@Entity
public class ProgLanguageUnderstanding {
    @EmbeddedId
    ProgLanguageUnderstandingKey id;

    @ManyToOne
    @MapsId("developerId")
    @JoinColumn(name = "developer_id")
    Developer developer;

    @ManyToOne
    @MapsId("progLanguageId")
    @JoinColumn(name = "progLanguage_id")
    ProgLanguage progLanguage;
}
