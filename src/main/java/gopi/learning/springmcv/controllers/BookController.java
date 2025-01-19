package gopi.learning.springmcv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

/**
 * Interface that defines a holder for model attributes.
 *
 * <p>Primarily designed for adding attributes to the model.
 *
 * <p>Allows for accessing the overall model as a {@code java.util.Map}.
 *
 * @author Juergen Hoeller
 * @since 2.5.1
 */
@Controller
@RequestMapping("/book")
public class BookController {

		@GetMapping("/order")
		public String getBook() {
			
			return "displaybookform";
		}
		
		@GetMapping("/processBookRequest")
		public String processRequets(HttpServletRequest request,Model model){
			
			String bookNameFromUser = request.getParameter("bookname");
			
			model.addAttribute("bookNameFromUser", bookNameFromUser);
			
			
			return "processBookRequest";
			
		}
}
