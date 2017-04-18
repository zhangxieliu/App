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
    public int id;
    /*生产日期*/
    @Column(name = "produceDate")
    public Date produceDate;
    /*班次*/
    @Column(name = "shift")
    public String shift;
    /*窑号*/
    @Column(name = "kilnNo")
    public String kilnNo;
    /*编号*/
    @Column(name = "number")
    public String number;
    /*色号*/
    @Column(name = "colorNum")
    public String colorNum;
    /*尺码*/
    @Column(name = "size")
    public String size;
    /*优等品*/
    @Column(name = "superNum")
    public Integer superNum;
    /*一等品*/
    @Column(name = "firstNum")
    public Integer firstNum;
    /*合格*/
    @Column(name = "qualifiedNum")
    public Integer qualifiedNum;
    /*次品*/
    @Column(name = "defectiveNum")
    public Integer defectiveNum;

    public ERPData(){

    }
}
