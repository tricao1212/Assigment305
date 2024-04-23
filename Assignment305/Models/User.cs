using System.ComponentModel.DataAnnotations;

namespace Assignment305.Models
{
    public class User
    {
        [Key]
        public int Id { get; set; }
        [Required]
        public string Email {  get; set; }
        [Required]
        public string PassWord { get; set; }
        [Required]
        public string Type {  get; set; } 
    }
}
