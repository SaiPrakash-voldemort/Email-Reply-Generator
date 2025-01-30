# Email Reply Generator

**Email Reply Generator** is a Java-based full-stack project that leverages AI (Gemini AI) to automatically generate email replies based on various tones (formal, casual, etc.). The backend is built using Spring Boot, while the frontend uses React.js for a user-friendly interface.

## Features
- **Backend**: 
  - Spring Boot, Spring Web, WebFlux for handling HTTP requests
  - Lombok for boilerplate code reduction
  - Integration with Gemini AI to generate email replies

- **Frontend**:
  - React.js, Material UI, Tailwind CSS for a responsive design
  - Axios for API calls
  - Interactive UI for easy email reply generation

- **Chrome Extension**:
  - Adds an "AI Reply" button next to the "Send" button in Gmail
  - Extracts email content from the DOM and generates a reply directly in the reply box

## Getting Started

### Prerequisites
- JDK 23 or higher
- Node.js (for React.js)
- A Gemini AI API key (for generating email replies)

### Backend Setup
1. Clone the repository.
2. Set up your environment variables for the Gemini AI API.
3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
