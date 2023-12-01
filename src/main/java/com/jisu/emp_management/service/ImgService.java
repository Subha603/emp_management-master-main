package com.jisu.emp_management.service;import com.jisu.emp_management.model.Image;import com.jisu.emp_management.repo.ImageRepo;import com.jisu.emp_management.utils.MyUtils;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import java.io.IOException;@Servicepublic class ImgService {    @Autowired    private ImageRepo repo;    public byte[] getImgbyid(Integer id) throws IOException {        Image image=this.repo.findById(id).orElseThrow(()->new RuntimeException("Image not found"));        byte[] res= MyUtils.decompressImage(image.getData());        return res;    }}