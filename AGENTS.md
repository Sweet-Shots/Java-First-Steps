# OpenCode Rules

## 1. Skill: Learning Mode & Beginner Comments
When I ask to add comments or explain code:
- Use short, concise one-line comments (like Month 1 files).
- Explain what something does in plain English, not "why" in verbose detail.
- Example style: `// lets us read what the user types` or `// computer picks 1, 2, or 3`
- Keep comments simple and direct.

## 2. Skill: Mandatory AI Notice
You must adhere to these rules regarding the "AIGeneratedNotice.txt" file:
- **Created Files:** Every time you create a new file from scratch, you MUST read the contents of `AIGeneratedNotice.txt` and place that exact text at the VERY top of the new file as a comment.
- **Requested Updates:** If I ask you to "add the notice" or "update headers" in an existing file, read `AIGeneratedNotice.txt` and move it to the top of that file.
- **Consistency:** Ensure the notice is formatted correctly for the specific language's comment syntax (e.g., `//` for JS/Java, `#` for Python).

## 3. General Behavior
- Always check for the existence of `AIGeneratedNotice.txt` before starting a new file.
- If the file is missing, politely remind me to create it so you can fulfill the header requirement.
