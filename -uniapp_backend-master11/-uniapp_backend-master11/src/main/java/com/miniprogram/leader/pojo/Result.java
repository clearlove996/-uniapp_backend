package com.miniprogram.leader.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一的响应结果类，用于标准化接口的返回结果。
 * 该类用于封装接口的返回值，包括状态码、消息和数据。
 */
@Data  // 自动生成 getter、setter、toString、equals 和 hashCode 方法
@AllArgsConstructor  // 自动生成带所有字段的构造函数
@NoArgsConstructor   // 自动生成无参构造函数
public class Result {

    /**
     * 状态码，用于表示请求的处理结果。
     * 通常使用 1 表示成功，其他值可以表示失败或不同类型的响应。
     */
    private Integer code;

    /**
     * 响应消息，用于描述请求的处理状态或结果。
     * 通常是一个简短的提示信息，例如 "success" 或 "error"。
     */
    private String msg;

    /**
     * 响应数据，包含请求处理后的具体数据。
     * 该字段可以是任何类型的数据（例如：List、Object等）。
     * 如果请求成功但没有数据返回，通常为 `null`。
     */
    private Object data;

    /**
     * 快速构建一个成功的响应结果，包含数据。
     * @param data 返回的数据，通常为业务处理的结果对象。
     * @return 包含成功状态的 Result 对象。
     */
    public static Result success(Object data){
        return new Result(1, "success", data);  // 返回状态码为 1，消息为 "success" 的 Result 对象
    }

    /**
     * 快速构建一个成功的响应结果，无数据。
     * @return 包含成功状态和空数据的 Result 对象。
     */
    public static Result success(){
        return new Result(1, "success", null);  // 返回状态码为 1，消息为 "success" 的 Result 对象
    }

    /**
     * 快速构建一个成功的响应结果，仅包含自定义消息。
     * @param msg 自定义的响应消息。
     * @return 包含成功状态和自定义消息的 Result 对象。
     */
    public static Result success(String msg){
        return new Result(1, msg, null);  // 返回状态码为 1，消息为自定义的 msg 字符串，数据为 null
    }

}
