package com.example.hanghae_market.controller;

import com.example.hanghae_market.dto.PostRequestDto;
import com.example.hanghae_market.dto.PostResponseDto;
import com.example.hanghae_market.dto.ResponseDto;
import com.example.hanghae_market.security.UserDetailsImpl;
import com.example.hanghae_market.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("post")
public class PostController {

    private final PostService postService;

    @PostMapping("/add")
    public void addPost(@RequestBody PostRequestDto postRequestDto, @AuthenticationPrincipal UserDetailsImpl userDetails){
        postService.addPost(postRequestDto, userDetails.getUser());
    }



//    @PostMapping("/add")
//    public ResponseDto addPost(@RequestParam("image")MultipartFile image, @RequestBody PostRequestDto postRequestDto, @AuthenticationPrincipal UserDetailsImpl userDetails) {
//        return postService.addPost(image, postRequestDto, userDetails.getUser());
//    }
//
//    @PutMapping("/{postid}")
//    public ResponseDto editPost(@PathVariable("postid") Long id, @RequestParam("image") MultipartFile image, @RequestParam PostRequestDto postRequestDto, @AuthenticationPrincipal UserDetailsImpl userDetails) {
//        return postService.editPost(id, image, postRequestDto, userDetails.getUser());
//    }
//
//    @PostMapping("/{postid}/tradestatus")
//    public ResponseDto editTrade(@PathVariable("posid") Long id, @RequestBody int tradeState, @AuthenticationPrincipal UserDetailsImpl userDetails){
//        return postService.editTrade(id, tradeState, userDetails.getUser());
//    }
//
//    @PutMapping("/up/{postid}")
//    public ResponseDto upPost(@PathVariable("postid") Long id, @AuthenticationPrincipal UserDetailsImpl userDetails){
//        return postService.upPost(id, userDetails.getUser());
//    }
//
//    @PostMapping("/{postid}/interest")
//    public ResponseDto postInterest(@PathVariable("postid") Long id, @AuthenticationPrincipal UserDetailsImpl userDetails){
//        return postService.postInterest(id, userDetails.getUser());
//    }
//
//    @GetMapping
//    public ResponseDto<List<PostResponseDto>> findAllPost(){
//        return postService.findAllPost();
//    }
//
//    @GetMapping("/{postid}")
//    public ResponseDto<PostResponseDto> findPostId(@PathVariable("postid") Long id){
//        return postService.findPostId(id);
//    }
//
//    @GetMapping("/recommend")
//    public ResponseDto<List<PostResponseDto>> findLikePost(){
//        return postService.findLikePost();
//    }
//
//    @GetMapping
//    public ResponseDto<List<PostResponseDto>> findSearch(@RequestParam("keyword") String keyword) {
//        return postService.findSearch(keyword);
//    }
//
//    @GetMapping("/mypage/interest")
//    public ResponseDto<List<PostResponseDto>> interestMypage(@AuthenticationPrincipal UserDetailsImpl userDetails){
//        return postService.interestMypage(userDetails.getUser());
//    }
//
//    @GetMapping("/mypage")
//    public ResponseDto<List<PostResponseDto>> myPost(@AuthenticationPrincipal UserDetailsImpl userDetails){
//        return postService.myPost(userDetails.getUser());
//    }
}