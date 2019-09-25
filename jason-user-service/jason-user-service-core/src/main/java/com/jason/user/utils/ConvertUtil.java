package com.jason.user.utils;

import com.jason.user.dto.manage.ManageDTO;
import com.jason.user.dto.role.RoleDTO;
import com.jason.user.dto.user.UserAddDTO;
import com.jason.user.dto.user.UserDetailDTO;
import com.jason.user.dto.user.UserSimpleDTO;
import com.jason.user.dto.user.UserUpdateDTO;
import com.jason.user.model.Manage;
import com.jason.user.model.Role;
import com.jason.user.model.User;
import com.jason.user.vo.*;
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

    public static UserAddDTO convertAdd(UserAddVO addVO) {
        UserAddDTO addDTO = new UserAddDTO();
        BeanUtils.copyProperties(addVO, addDTO);
        return addDTO;
    }

    public static User convertAdd(UserAddDTO addDTO) {
        User user = new User();
        BeanUtils.copyProperties(addDTO, user);
        return user;
    }

    public static User convertUpdate(UserUpdateDTO updateDTO) {
        User user = new User();
        BeanUtils.copyProperties(updateDTO, user);
        return user;
    }

    public static UserSimpleDTO convertSimple(User user) {
        UserSimpleDTO simpleDTO = new UserSimpleDTO();
        BeanUtils.copyProperties(user, simpleDTO);
        return simpleDTO;
    }

    public static UserSimpleVO convertSimple(UserSimpleDTO simpleDTO) {
        UserSimpleVO simpleVO = new UserSimpleVO();
        BeanUtils.copyProperties(simpleDTO, simpleVO);
        return simpleVO;
    }

    public static UserDetailDTO convertDetail(User user) {
        UserDetailDTO detailDTO = new UserDetailDTO();
        BeanUtils.copyProperties(user, detailDTO);
        return detailDTO;
    }

    public static UserDetailVO convertDetail(UserDetailDTO detailDTO) {
        UserDetailVO user = new UserDetailVO();
        BeanUtils.copyProperties(detailDTO, user);
        return user;
    }

    public static RoleDTO convertRoleDTO(RoleVO roleVO) {
        RoleDTO roleDTO = new RoleDTO();
        BeanUtils.copyProperties(roleVO, roleDTO);
        return roleDTO;
    }

    public static Role convertRole(RoleDTO roleDTO) {
        Role role = new Role();
        BeanUtils.copyProperties(roleDTO, role);
        return role;
    }

    public static ManageDTO convertManage(ManageVO manageVO){
        ManageDTO manageDTO = new ManageDTO();
        BeanUtils.copyProperties(manageVO, manageDTO);
        return manageDTO;
    }

    public static Manage convertMange(ManageDTO manageDTO){
        Manage manage = new Manage();
        BeanUtils.copyProperties(manageDTO, manage);
        return manage;
    }
}
