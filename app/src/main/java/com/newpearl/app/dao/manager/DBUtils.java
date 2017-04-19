package com.newpearl.app.dao.manager;

import com.newpearl.app.bean.ERPData;

import org.xutils.DbManager;
import org.xutils.db.Selector;
import org.xutils.db.table.TableEntity;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.List;

/**
 * Created by Administrator on 2017/4/18 0018.
 */

public class DBUtils {
    DbManager.DaoConfig daoConfig = new DbManager.DaoConfig()
            // 设置数据库名称，默认为xutils.db
            .setDbName("newpearl.db")
            // 设置表创建时的监听
            .setTableCreateListener(new DbManager.TableCreateListener() {
                @Override
                public void onTableCreated(DbManager db, TableEntity<?> table) {

                }
            })
            // 设置是否开启事务，默认true
            .setAllowTransaction(true)
            // 设置数据库路径，默认安装程序路径下
//            .setDbDir(new File("/mnt/sdcard"))
            // 设置数据库的版本
            .setDbVersion(1)
            // 设置数据库更新的监听
            .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
                @Override
                public void onUpgrade(DbManager db, int oldVersion, int newVersion) {

                }
            })
            // 设置数据库打开的监听
            .setDbOpenListener(new DbManager.DbOpenListener() {
                @Override
                public void onDbOpened(DbManager db) {
                    // 开启数据库支持多线程操作，提升性能
                    db.getDatabase().enableWriteAheadLogging();
                }
            });
    DbManager db = x.getDb(daoConfig);

    /**
     * 保存或更新数据
     * @param erpData
     * @throws DbException
     */
    public void saveOrUpdate(ERPData erpData) throws DbException {
        db.saveOrUpdate(erpData);
    }

    /**
     * 查询全部数据
     * @return
     * @throws DbException
     */
    public List<ERPData> find() throws DbException {
        List<ERPData> all = db.findAll(ERPData.class);
        return all;
    }

    /**
     * 根据id查找数据
     * @param erpData
     * @param id
     * @return
     * @throws DbException
     */
    public ERPData findBy(ERPData erpData, int id) throws DbException {
        return db.findById(ERPData.class, id);
    }

    public List<ERPData> findByERPData(ERPData erpData) throws DbException {
        Selector<ERPData> selector = db.selector(ERPData.class);
        return null;
    }
}
