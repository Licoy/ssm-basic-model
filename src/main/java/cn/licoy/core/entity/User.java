package cn.licoy.core.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author licoy.cn
 * @version 2017/10/10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName(value = "user")
public class User {

    private Integer id;

    private String name;

}
