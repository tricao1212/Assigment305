using System.ComponentModel.DataAnnotations;

namespace Assignment305.Models
{
    public class PropertyOwner
    {
        [Key]
        public int Id { get; set; }
        public ICollection<Property> Properties { get; set; }
    }
}
