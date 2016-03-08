package android.library.wdroid.common.exception;

/**
 * Author: Copyright (c) Wuziwen(wuziwen@coamc.com) All rights reserved.<br>
 * Date: Create on 2016/3/8 17:09 <br>
 * Title: Wdroid <br>
 * Package: android.library.wdroid.common.exception <br>
 * Description:
 */
public class W_StorageException extends W_BaseException {

    private String message;

    public W_StorageException() {
        super();
    }

    public W_StorageException(String message) {
        super(message);
        this.message = message;
    }

    public W_StorageException(Throwable throwable) {
        super(throwable);
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }


}
