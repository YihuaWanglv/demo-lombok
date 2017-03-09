package com.iyihua.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Builder
@Accessors(chain = true)
@Data
@NoArgsConstructor
//@RequiredArgsConstructor(staticName = "ofName")
@AllArgsConstructor
public class User {

	private long id;
	private String name;
}
