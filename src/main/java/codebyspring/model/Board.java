package codebyspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
	Long bno;
	String title; 
	String content; 
	String writer; 
	String regdate; 
	String updatedate;
}
