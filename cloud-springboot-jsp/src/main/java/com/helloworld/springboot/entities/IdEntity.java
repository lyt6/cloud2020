package com.helloworld.springboot.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class IdEntity {

    @TableId(value = "id", type = IdType.AUTO)
    protected Long id;

}
