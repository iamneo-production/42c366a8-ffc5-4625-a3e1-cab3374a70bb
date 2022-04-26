import React, { Component } from 'react';
import { Navbar, Nav, Container } from 'react-bootstrap';
import { Link } from 'react-router-dom';
class Navbarmenu extends Component {
    render() {
        return (
            <div>
                <Navbar className="navbar" variant="dark" expand="lg">
          <Container>
          {
                !localStorage.getItem('admin')?
                <Navbar.Brand href="/">Millennials Glow</Navbar.Brand>
              :
                <Navbar.Brand href="/admin">Millennials Glow</Navbar.Brand>
            }
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="mr-auto">
            {
                !localStorage.getItem('admin')?
              <Nav.Link><Link className="link" to="/">Home</Link></Nav.Link>
              :
              ""
            }
            {
              localStorage.getItem('login')?
              <Nav.Link><Link className="link" to="/cart">Cart</Link></Nav.Link>
              :
              ""
            }
              {
                localStorage.getItem('admin')?
                <Nav.Link><Link className="link" to="/admin">Products</Link></Nav.Link>
                :
                ""
              }
              {
                localStorage.getItem('admin')?
                <Nav.Link><Link className="link" to="/addproduct">Add Product</Link></Nav.Link>
                :
                ""
              }
{
                localStorage.getItem('admin')?
                <Nav.Link><Link className="link" to="/users">Users</Link></Nav.Link>
                :
                ""
              }
{
                localStorage.getItem('admin')?
                <Nav.Link><Link className="link" to="/orders">Orders</Link></Nav.Link>
                :
                ""
              }
              {
                localStorage.getItem('login')?
                <Nav.Link><Link className="link" to="/myorders">My Orders</Link></Nav.Link>
                :
                ""
              }
              {
                localStorage.getItem('login') || localStorage.getItem('admin')?
                <Nav.Link ><Link className="link" to="/logout">Logout</Link></Nav.Link>
                :
                <>
                <Nav.Link><Link className="link" to="/create">Sign-Up</Link></Nav.Link>
                <Nav.Link><Link className="link" to="/login">Login</Link></Nav.Link>
                </>
              }
            </Nav>
          </Navbar.Collapse>
          </Container>
        </Navbar>
            </div>
        );
    }
}

export default Navbarmenu;