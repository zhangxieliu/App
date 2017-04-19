package com.newpearl.app.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

import java.util.Date;

/**
 * 仓库和品管人员在仓库里进行盘点和数据录入，填写内容
 */

/**
 * onCreate="sql":当第一次创建表需要插入数据时在此写sql语句
 */
@Table(name = "erp_data", onCreated = "")
public class ERPData {
    @Column(name = "id", isId = true, autoGen = true)
    private int id;
    /*生产日期*/
    @Column(name = "produceDate")
    private Date produceDate;
    /*班次*/
    @Column(name = "shift")
    private String shift;
    /*窑号*/
    @Column(name = "kilnNo")
    private String kilnNo;
    /*编号*/
    @Column(name = "number")
    private String number;
    /*色号*/
    @Column(name = "colorNum")
    private String colorNum;
    /*尺码*/
    @Column(name = "size")
    private String size;
    /*优等品*/
    @Column(name = "superNum")
    private Integer superNum;
    /*一等品*/
    @Column(name = "firstNum")
    private Integer firstNum;
    /*合格*/
    @Column(name = "qualifiedNum")
    private Integer qualifiedNum;
    /*次品*/
    @Column(name = "defectiveNum")
    private Integer defectiveNum;

    public ERPData(){

    }

    public ERPData(Date produceDate, String shift, String kilnNo, String number,
                   String colorNum, String size) {
        this.produceDate = produceDate;
        this.shift = shift;
        this.kilnNo = kilnNo;
        this.number = number;
        this.colorNum = colorNum;
        this.size = size;
    }

    public ERPData(Date produceDate, String shift, String kilnNo, String number,
                   String colorNum, String size, Integer superNum, Integer firstNum,
                   Integer qualifiedNum, Integer defectiveNum) {
        this.produceDate = produceDate;
        this.shift = shift;
        this.kilnNo = kilnNo;
        this.number = number;
        this.colorNum = colorNum;
        this.size = size;
        this.superNum = superNum;
        this.firstNum = firstNum;
        this.qualifiedNum = qualifiedNum;
        this.defectiveNum = defectiveNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getKilnNo() {
        return kilnNo;
    }

    public void setKilnNo(String kilnNo) {
        this.kilnNo = kilnNo;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColorNum() {
        return colorNum;
    }

    public void setColorNum(String colorNum) {
        this.colorNum = colorNum;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getSuperNum() {
        return superNum;
    }

    public void setSuperNum(Integer superNum) {
        this.superNum = superNum;
    }

    public Integer getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Integer firstNum) {
        this.firstNum = firstNum;
    }

    public Integer getQualifiedNum() {
        return qualifiedNum;
    }

    public void setQualifiedNum(Integer qualifiedNum) {
        this.qualifiedNum = qualifiedNum;
    }

    public Integer getDefectiveNum() {
        return defectiveNum;
    }

    public void setDefectiveNum(Integer defectiveNum) {
        this.defectiveNum = defectiveNum;
    }

    @Override
    public String toString() {
        return "ERPData{" +
                "id=" + id +
                ", produceDate=" + produceDate +
                ", shift='" + shift + '\'' +
                ", kilnNo='" + kilnNo + '\'' +
                ", number='" + number + '\'' +
                ", colorNum='" + colorNum + '\'' +
                ", size='" + size + '\'' +
                ", superNum=" + superNum +
                ", firstNum=" + firstNum +
                ", qualifiedNum=" + qualifiedNum +
                ", defectiveNum=" + defectiveNum +
                '}';
    }
}
