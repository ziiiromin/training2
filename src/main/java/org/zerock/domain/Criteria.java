package org.zerock.domain;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria { 
	private int pageNum;
	private int amount;
	private String type;
	private String keyword;
	private String cate;
	
	public Criteria() {		
		this(1, 12);		
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	public String getListlink() {
		UriComponentsBuilder builder=UriComponentsBuilder.fromPath("")
				.queryParam("cate", this.getCate())
				.queryParam("pageNum", this.pageNum)
				.queryParam("amount", this.getAmount())
				.queryParam("type", this.getType())
				.queryParam("keyword", this.getKeyword());
		return builder.toString();
			
		}
	
}