package codebyspring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import codebyspring.model.Board;

public interface BoardMapper {
	
	public List<Board> getList(); 
}
