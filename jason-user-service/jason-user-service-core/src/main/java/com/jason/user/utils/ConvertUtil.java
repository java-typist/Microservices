package com.jason.user.utils;

import com.jason.user.dto.user.UserAddDTO;
import com.jason.user.dto.user.UserSimpleDTO;
import com.jason.user.dto.user.UserUpdateDTO;
import com.jason.user.model.User;
import com.jason.user.vo.UserAddVO;
import com.jason.user.vo.UserSimpleVO;
import com.jason.user.vo.UserUpdateVO;
import org.springframework.beans.BeanUtils;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/20 9:16
 * @modify 2019/9/20 9:16
 */
public class ConvertUtil {

    public static UserUpdateDTO convertUpdate(UserUpdateVO updateVO) {
        UserUpdateDTO updateDTO = new UserUpdateDTO();
        BeanUtils.copyProperties(updateVO, updateDTO);
        return updateDTO;
    }

    public static UserAddDTO convertAdd(UserAddVO addVO){
        UserAddDTO addDTO = new UserAddDTO();
        BeanUtils.copyProperties(addVO, addDTO);
        return addDTO;
    }

    public static User convertAdd(UserAddDTO addDTO){
        User user = new User();
        BeanUtils.copyProperties(addDTO, user);
        return user;
    }

    public static User convertUpdate(UserUpdateDTO updateDTO){
        User user = new User();
        BeanUtils.copyProperties(updateDTO, user);
        return user;
    }

    public static UserSimpleDTO convertSimple(User user){
        UserSimpleDTO simpleDTO = new UserSimpleDTO();
        BeanUtils.copyProperties(user, simpleDTO);
        return simpleDTO;
    }

    public static UserSimpleVO convertSimple(UserSimpleDTO simpleDTO){
        UserSimpleVO simpleVO = new UserSimpleVO();
        BeanUtils.copyProperties(simpleDTO, simpleVO);
        return simpleVO;
    }
}
