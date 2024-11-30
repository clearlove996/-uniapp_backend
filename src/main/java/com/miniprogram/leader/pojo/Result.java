package com.miniprogram.leader.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
        private Integer code;
        private String msg;
        private Object data;

        //定义静态方法 帮助我们快速构造result对象
        public static Result success(Object data){
            return new Result(1,"success",data);
        }

        public static Result success(){
            return new Result(1,"success",null);
        }

        public static Result success(String msg){
            return new Result(1,msg,null);
        }

}
