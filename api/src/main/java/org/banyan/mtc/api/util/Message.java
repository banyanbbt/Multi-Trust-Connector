package org.banyan.mtc.api.util;

import java.io.Serializable;

/**
 * Copyright (C), 2018, Banyan Network Foundation
 * <p>
 * Common Response Message Body
 *
 * @author Norman
 * @since 0.1.0
 * <p>
 * 2018/3/26 15:21
 */
public class Message implements Serializable {

    private static final long serialVersionUID = -6431953097274713911L;

    private String code;

    private String status;

    private String msg;

    private Object data;

    private Message() {
    }

    public String getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public static class Builder {
        Message message = new Message();

        public Builder setCode(SubmitCode submitCode) {
            message.code = submitCode.getCode();
            message.status = submitCode.getStatus();
            message.msg = submitCode.getMsg();
            return this;
        }

        public Builder setData(Object data) {
            message.data = data;
            return this;
        }

        public Message build() {
            return this.message;
        }
    }

    @Override
    public String toString() {
        return "Message{" + "code='" + code + '\'' + ", status='" + status + '\'' + ", msg='" + msg + '\'' + ", data=" + data + '}';
    }
}
