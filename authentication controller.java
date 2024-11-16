@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        // Logic for login
        return ResponseEntity.ok("JWT Token");
    }
    @PostMapping("/logout")
    public ResponseEntity<Void> logout() {
        // Logic for logout
        return ResponseEntity.noContent().build();
    }
}
