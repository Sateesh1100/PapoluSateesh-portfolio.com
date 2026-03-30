package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.CommentsApiData;

@RestController
public class commentscontroller {

    @PostMapping("/comments/add") // http://localhost:8080/comments/add
    public String addcomment(@RequestBody CommentsApiData apiData) {

        return "Comment Added: " + apiData.toString();

        // {
        //   "comments": "Hello, world!",
        //   "userId" : "12353",
        //   "videoId": "1234567890",
        //   "commented": "nicee videoss"
        // }

    }

    // Patch API -- comments_id = 5
    // comment text , comment Id kavali

    @PatchMapping("/comments/{commentId}") //http://localhost:8080/comments/87585
    public String UpdatedComment(@PathVariable String commentId) {

        return "Comments text uptated for comment id: " + commentId;

    }
    
    @PutMapping("/comments/{commentId}")
    public String updateCompleteComment(@PathVariable String commentId,@RequestBody CommentsApiData apiData
    		) {

    	return "Comment Upadated " + apiData.toString();
    }
    
    @DeleteMapping("comments/{commentId}")
    public String deleteComments(@PathVariable String commentId ) {
    	return "comment delete: " + commentId;
    	
    }

}



//@PathVariable enduku use chestaru?
//
//Specific record ni identify cheyadaniki use chestaru.
//Mostly ID ni URL nundi capture cheyadaniki use chestaru.
//
//Example:
//
//DELETE /comments/87585
//
//Ikkada:
//87585 → commentId
//@PathVariable String commentId
//
//--------------------------------------------------
//
//DELETE API lo:
//
//Purpose:
//Specific comment ni delete cheyadaniki.
//
//Code meaning:
//DELETE /comments/{commentId}
//
//Example:
//DELETE /comments/87585
//
//Meaning:
//87585 id unna comment delete cheyyi.
//
//--------------------------------------------------
//
//PUT API lo:
//
//Purpose:
//Specific comment ni full ga update cheyadaniki.
//
//Code meaning:
//PUT /comments/{commentId}
//
//Example:
//PUT /comments/87585
//
//Meaning:
//87585 id unna comment complete ga update cheyyi.
//
//--------------------------------------------------
//
//PATCH API lo:
//
//Purpose:
//Specific comment lo konni fields matrame update cheyadaniki.
//
//Code meaning:
//PATCH /comments/{commentId}
//
//Example:
//PATCH /comments/87585
//
//Meaning:
//87585 id unna comment lo konni changes matrame cheyyi.
//
//--------------------------------------------------
//
//Simple Rule:
//
//@PathVariable → Resource identification (ID)
//@RequestBody  → Data content (JSON)
//@RequestParam → Small query/filter values
//
//--------------------------------------------------
//
//Nee current APIs summary:
//
//POST   /comments/add        → New comment create
//PATCH  /comments/{id}       → Partial update
//PUT    /comments/{id}       → Full update
//DELETE /comments/{id}       → Delete comment
