using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Assignment305.Models
{
    public class Property
    {
        [Key]
        public int Id { get; set; }
        public string Description { get; set; }

        [ForeignKey(nameof(PropertyOwner))]
        [Required]
        public int PropertyOwnerId { get; set; }
        public PropertyOwner PropertyOwner { get; set; }
    }
}
