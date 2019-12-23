package com.bychkov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "words")
public class Words {

    @Id
    //@Column(name = "idwords")
    private int idwords;

   // @Column(name = "wordRu")
    private String wordRu;

   // @Column(name = "wordEn")
    private String wordEn;

    public Words() {
    }

    public Words(String wordRu, String wordEn) {
        this.wordRu = wordRu;
        this.wordEn = wordEn;
    }

    public String getWordRu() {
        return wordRu;
    }

    public void setWordRu(String wordRu) {
        this.wordRu = wordRu;
    }

    public String getWordEn() {
        return wordEn;
    }

    public void setWordEn(String wordEn) {
        this.wordEn = wordEn;
    }
}
