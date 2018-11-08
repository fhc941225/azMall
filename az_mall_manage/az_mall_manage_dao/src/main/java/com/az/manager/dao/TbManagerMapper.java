package com.az.manager.dao;

import com.az.manager.pojo.po.TbManager;
import com.az.manager.pojo.po.TbManagerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_manager
     *
     * @mbggenerated Thu Nov 08 09:49:11 CST 2018
     */
    int countByExample(TbManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_manager
     *
     * @mbggenerated Thu Nov 08 09:49:11 CST 2018
     */
    int deleteByExample(TbManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_manager
     *
     * @mbggenerated Thu Nov 08 09:49:11 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_manager
     *
     * @mbggenerated Thu Nov 08 09:49:11 CST 2018
     */
    int insert(TbManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_manager
     *
     * @mbggenerated Thu Nov 08 09:49:11 CST 2018
     */
    int insertSelective(TbManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_manager
     *
     * @mbggenerated Thu Nov 08 09:49:11 CST 2018
     */
    List<TbManager> selectByExample(TbManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_manager
     *
     * @mbggenerated Thu Nov 08 09:49:11 CST 2018
     */
    TbManager selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_manager
     *
     * @mbggenerated Thu Nov 08 09:49:11 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbManager record, @Param("example") TbManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_manager
     *
     * @mbggenerated Thu Nov 08 09:49:11 CST 2018
     */
    int updateByExample(@Param("record") TbManager record, @Param("example") TbManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_manager
     *
     * @mbggenerated Thu Nov 08 09:49:11 CST 2018
     */
    int updateByPrimaryKeySelective(TbManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_manager
     *
     * @mbggenerated Thu Nov 08 09:49:11 CST 2018
     */
    int updateByPrimaryKey(TbManager record);
}