//package com.example.demo.controllers;
//
//package com.example.demo.controllers;
//
//import com.example.demo.models.Expense;
//import com.example.demo.services.ExpenseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/expenses")
//public class ExpenseController {
//
//    @Autowired
//    private ExpenseService expenseService;
//
//    @PostMapping
//    public Expense addExpense(@RequestBody Expense expense, Authentication authentication) {
//        expense.setUser((User) authentication.getPrincipal());
//        return expenseService.addExpense(expense);
//    }
//
//    @GetMapping
//    public List<Expense> getExpenses(Authentication authentication) {
//        Long userId = ((User) authentication.getPrincipal()).getId();
//        return expenseService.getExpensesByUser(userId);
//    }
//
//    @PutMapping("/{id}")
//    public Expense editExpense(@PathVariable Long id, @RequestBody Expense expenseDetails, Authentication authentication) {
//        Expense expense = expenseService.getExpenseById(id);
//        if (expense.getUser().getId().equals(((User) authentication.getPrincipal()).getId())) {
//            expense.setCategory(expenseDetails.getCategory());
//            expense.setAmount(expenseDetails.getAmount());
//            expense.setComments(expenseDetails.getComments());
//            return expenseService.editExpense(expense);
//        } else {
//            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Unauthorized");
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> deleteExpense(@PathVariable Long id, Authentication authentication) {
//        Expense expense = expenseService.getExpenseById(id);
//        if (expense.getUser().getId().equals(((User) authentication.getPrincipal()).getId())) {
//            expenseService.deleteExpense(id);
//            return ResponseEntity.ok().build();
//        } else {
//            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Unauthorized");
//        }
//    }
//}
