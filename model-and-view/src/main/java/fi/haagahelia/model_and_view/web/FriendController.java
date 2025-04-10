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
public class FriendController {
    private List<Friend> friendList = new ArrayList<>();

    @GetMapping("/friend")
    public String showFriends(Model model) {
        model.addAttribute("friendList", friendList);
        return "friend";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("friend", new Friend());
        return "add";
    }
    
    @PostMapping("/result")
    public String addFriend(@ModelAttribute Friend fr) {
        friendList.add(fr);
        return "redirect:/friend";
    }
    
}
