@RestController
@RequestMapping("/api/students")
public class StudentController {
    @GetMapping
    public List<Student> getAllStudents() {
        // Fetch all students
        return studentService.findAll();
    }
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        // Add new student
        return studentService.save(student);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        // Update student by ID
        return studentService.update(id, student);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        // Delete student by ID
        studentService.delete(id);
    }
}
