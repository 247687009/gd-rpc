package io.goudai.rpc.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by freeman on 2016/1/17.
 */
@Builder
@Data
public class Request implements Serializable {

    /**
     * id requset��Ψһ��ʾ
     */
    private String id;

    /**
     * ��Ҫ���е��õķ���ӿ�ȫ��
     */
    private String service;
    /**
     * ������
     */
    private String methodName;
    /**
     * ����
     */
    private Object[] params;

    /**
     * ��������
     */
    private Class<?>[] patamType;


}
