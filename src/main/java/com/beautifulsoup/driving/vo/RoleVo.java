package com.beautifulsoup.driving.vo;

import com.beautifulsoup.driving.common.Date2LongSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoleVo implements Serializable {

    private static final long serialVersionUID = 3861979206867458087L;
    private String roleName;

    private String remark;

    private String operator;

    private Integer type;

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

}
