package com.example.demo.pojo;

import lombok.Data;

@Data
public class CommentsApiData {
	private String comments;
	private String userId;
	private String videoId;
	private String commented;

}
