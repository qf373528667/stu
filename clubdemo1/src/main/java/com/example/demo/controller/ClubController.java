package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.entities.Club;
import com.example.demo.entities.ClubType;
import com.example.demo.mapper.ClubMapper;
import com.example.demo.mapper.ClubTypeMapper;

@Controller
public class ClubController {

    @Autowired
    ClubMapper clubMapper;
    @Autowired
    ClubTypeMapper clubTypeMapper;
    
    @GetMapping("/showclubs")
    public String  list(Model model){
        Collection<Club> clubs = clubMapper.getAllClub();
        //放在请求域中
        model.addAttribute("clubs",clubs);
        // thymeleaf默认就会拼串
        // classpath:/templates/xxxx.html
        return "list";
    }

    @GetMapping("/club")
    public String toAddPage(Model model){
        Collection<ClubType> clubTypes = clubTypeMapper.getAllClubType();
        model.addAttribute("clubTypes",clubTypes);
        return "add";
    }

    //俱乐部添加
    //SpringMVC自动将请求参数和入参对象的属性进行一一绑定；要求请求参数的名字和javaBean入参的对象里面的属性名是一样的
    @PostMapping("/club")
    public String addEmp(Club club){
    	clubMapper.insertClub(club);
        // redirect: 表示重定向到一个地址  /代表当前项目路径
        // forward: 表示转发到一个地址
        return "redirect:/showclubs";
    }

    @GetMapping("/club/{name}")
    public String toEditPage(@PathVariable("name") String name,Model model){
    	
    	Club club=clubMapper.getClubByName(name);
    	model.addAttribute("club",club);
        
        Collection<ClubType> clubTypes=clubTypeMapper.getAllClubType();
        model.addAttribute("clubTypes", clubTypes);
        //回到修改页面(add是一个修改添加二合一的页面);
        return "add";
    }

    @PutMapping("/club")
    public String updateClub(Club club){
    	System.out.println(club);
    	clubMapper.updateClub(club);
    	
        return "redirect:/showclubs";
    }

    @DeleteMapping("/club/{clubName}")
    public String deleteEmployee(@PathVariable("clubName") String clubName){
    	clubMapper.delete(clubName);
        return "redirect:/showclubs";
    }

}
