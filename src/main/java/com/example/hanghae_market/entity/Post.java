package com.example.hanghae_market.entity;

import com.example.hanghae_market.dto.PostRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Post extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //@Column
    //private String iamge;

    @Column(nullable = false)
    private String postTitle;

    @Column(nullable = false)
    private String postContent;

    @Column
    @ElementCollection
    private List<String> tradeLocation;

    @Column
    private int postPrice;

    @Column
    private int tradeState;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "post", cascade = CascadeType.REMOVE)
    List<Interest> interests;


    public Post(PostRequestDto postRequestDto, User user) {
        this.postTitle = postRequestDto.getPostTitle();
        this.postContent = postRequestDto.getPostContent();
        this.tradeLocation = postRequestDto.getTradeLocationRequestDtoList();
        this.postPrice = postRequestDto.getPostPice();
        this.tradeState = 0;
        this.user = user;
    }

    public void edit(MultipartFile image, PostRequestDto postRequestDto) {
        this.postTitle = postRequestDto.getPostTitle();
        this.postContent = postRequestDto.getPostContent();
        this.tradeLocation = postRequestDto.getTradeLocationRequestDtoList();
    }
}
