package com.sharma.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
@RequiredArgsConstructor
@Getter @Setter
@ToString
@NoArgsConstructor
public class Comment extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;

    //link
    @NonNull
    @ManyToOne
    private Link link;


//    public Comment(String body, Link link) {
//        this.body = body;
//        this.link = link;
//    }
}
