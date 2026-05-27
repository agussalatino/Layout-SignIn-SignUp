package ort.tp3.mundocompose

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ort.tp3.mundocompose.ui.theme.HolaMundoComposeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(onBackClick: () -> Unit = {}) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF8F9FF)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp)) {
                IconButton(onClick = onBackClick) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            // Title
            Text(
                text = "Login here",
                color = Color(0xFF1F41BB),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Subtitle
            Text(
                text = "Welcome back you've\nbeen missed!",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                lineHeight = 28.sp
            )

            Spacer(modifier = Modifier.height(60.dp))

            // Email Field
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(64.dp),
                placeholder = { Text("Email", color = Color.Gray) },
                shape = RoundedCornerShape(10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFF1F4FF),
                    unfocusedContainerColor = Color(0xFFF1F4FF),
                    focusedBorderColor = Color(0xFF1F41BB),
                    unfocusedBorderColor = Color.Transparent,
                )
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Password Field
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(64.dp),
                placeholder = { Text("Password", color = Color.Gray) },
                shape = RoundedCornerShape(10.dp),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFF1F4FF),
                    unfocusedContainerColor = Color(0xFFF1F4FF),
                    focusedBorderColor = Color(0xFF1F41BB),
                    unfocusedBorderColor = Color.Transparent,
                )
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Forgot Password
            Text(
                text = "Forgot your password?",
                color = Color(0xFF1F41BB),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.align(Alignment.End)
            )

            Spacer(modifier = Modifier.height(30.dp))

            // Sign In Button
            Button(
                onClick = { /* TODO: Sign In */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1F41BB)),
                shape = RoundedCornerShape(10.dp),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
            ) {
                Text(
                    text = "Sign in",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            // Create new account
            TextButton(onClick = { /* TODO: Register */ }) {
                Text(
                    text = "Create new account",
                    color = Color(0xFF494949),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(modifier = Modifier.height(50.dp))

            // Social Login Section
            Text(
                text = "Or continue with",
                color = Color(0xFF1F41BB),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                SocialButton(iconPlaceholder = "G") 
                SocialButton(iconPlaceholder = "f") 
                SocialButton(iconPlaceholder = "A") 
            }
        }
    }
}

@Composable
fun SocialButton(iconPlaceholder: String) {
    Surface(
        modifier = Modifier.size(60.dp, 44.dp),
        color = Color(0xFFECECEC),
        shape = RoundedCornerShape(10.dp),
        onClick = { /* TODO */ }
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(
                text = iconPlaceholder,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    HolaMundoComposeTheme {
        LoginScreen()
    }
}
