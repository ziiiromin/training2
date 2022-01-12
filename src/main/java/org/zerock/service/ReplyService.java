package org.zerock.service;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyPageDTO;
import org.zerock.domain.ReplyVO;

public interface ReplyService {
	public List<ReplyVO> selectAll();
	public int register(ReplyVO vo);
	public ReplyVO get(int rno);
	public int remove(int rno);
	public int delUpdate(ReplyVO vo);
	public int modify(ReplyVO vo);
	public List<ReplyVO> getList(Criteria cri,int bno);
	public ReplyPageDTO getListPage(Criteria cri, int bno);
}