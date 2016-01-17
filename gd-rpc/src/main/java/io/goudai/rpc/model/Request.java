package io.goudai.rpc.model;

import java.io.Serializable;

/**
 * Created by freeman on 2016/1/17.
 */
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class<?>[] getPatamType() {
        return patamType;
    }

    public void setPatamType(Class<?>[] patamType) {
        this.patamType = patamType;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
