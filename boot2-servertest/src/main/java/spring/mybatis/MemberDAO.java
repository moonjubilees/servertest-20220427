package spring.mybatis;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Mapper //마이바티스 sql 실행 (id, resulttype, parametertype)
@Repository("mybatisdao")
public interface MemberDAO {
	
	public int insertmember(MemberDTO dto);
	
	public int updatemember(MemberDTO dto);
	
	public int deletemember(String id) ;
	
	public List<MemberDTO> memberlist() ;
	
	public List<MemberDTO> paginglist(int[] page);
	
	public List<String> addresssearch(String[] address);
	
	public MemberDTO member(String id) ;
	
}