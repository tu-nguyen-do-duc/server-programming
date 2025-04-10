package fi.haagahelia.model_and_view.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fi.haagahelia.domain.Friend;

import org.springframework.ui.Model;



@Controller
public class FriendController2 {
    private List<Friend> friendList2 = new ArrayList<>();

    @GetMapping("/friend2")
    public String friendForm(Model model) {
        model.addAttribute("friendList2", friendList2);
        model.addAttribute("friend", new Friend());
        return "friend2";
    }

    @PostMapping("/friend2")
    public String addFriend(@ModelAttribute Friend fr) {
        friendList2.add(fr);
        return "redirect:/friend2";
    }
    
}
