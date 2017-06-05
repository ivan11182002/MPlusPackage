package xe.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import xe.bean.JobHistory;
import xe.bean.JobHistoryKey;
import xe.dao.example.JobHistoryExample;

public interface JobHistoryMapper {
    long countByExample(JobHistoryExample example);

    int deleteByExample(JobHistoryExample example);

    int deleteByPrimaryKey(JobHistoryKey key);

    int insert(JobHistory record);

    int insertSelective(JobHistory record);

    List<JobHistory> selectByExample(JobHistoryExample example);

    JobHistory selectByPrimaryKey(JobHistoryKey key);

    int updateByExampleSelective(@Param("record") JobHistory record, @Param("example") JobHistoryExample example);

    int updateByExample(@Param("record") JobHistory record, @Param("example") JobHistoryExample example);

    int updateByPrimaryKeySelective(JobHistory record);

    int updateByPrimaryKey(JobHistory record);
}