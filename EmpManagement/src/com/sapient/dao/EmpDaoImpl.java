package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.sapient.exceptions.IdException;
import com.sapient.exceptions.NotFoundException;
import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

/**
 * This class contains methods that interacts with DB and performs CRUD
 * operations
 * 
 * @author hbharg
 * @version 1.0
 */
public class EmpDaoImpl extends AEmpDao implements Idao {

	@Override
	/**
	 * this method adds employee.
	 * 
	 * @param Emp
	 *            - pass emp instance.
	 * @return int - returns -1 if added.
	 * @throws throws
	 *             IdException if employee ID already exists.
	 */
	public int addEmployee(Emp emp) throws IdException {
		Connection conn = getConn();
		try {
			PreparedStatement st = conn.prepareStatement(Queries.addemp);
			st.setInt(1, emp.getEmpId());
			st.setString(2, emp.getEmpName());
			st.setDouble(3, emp.getEmpSal());
			st.setString(4, emp.getDept());
			st.setDate(5, new java.sql.Date(emp.getDoj().getTime()));
			EmpUtil.viewLogger().trace(" binded parameters to query ");
			int row = st.executeUpdate();
			EmpUtil.viewLogger().debug(row + " row added ");
			return row;
		} catch (SQLException e) {
			EmpUtil.viewLogger().error(e.getMessage());
			throw new IdException("employee id already exists");
		} finally {
			closeConn(conn);
		}

	}

	/**
	 * this method updates the salary for the given employee ID.
	 * 
	 * @param sal-
	 *            employee salary
	 * @param eid
	 *            - Employee ID
	 * @return returns 1 if updated.
	 * @throws throws
	 *             NOT found exception if no row found.
	 */
	@Override
	public int updateEmployee(int eid, double sal) throws NotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * this method removes and employee for the given employee ID.
	 * 
	 * @param eid
	 *            - Employee ID
	 * @return int- returns 1 if removed.
	 * @throws throws
	 *             NOT found exception if no row found.
	 */
	@Override
	public int removeEmployee(int eid) throws NotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * this method views all the employees for the given empID
	 * 
	 * @return Emp - returns list of Emp Instances
	 * @throws throws  NotFoundException if no row found.
	 * @see viewEmployees(int), viewEmployees(String)
	 */
	@Override
	public List<Emp> viewEmployees() throws NotFoundException {
		List<Emp> elist = new ArrayList<Emp>();
		Connection conn = getConn();
		Emp emp = null;
		try {
			PreparedStatement st = conn.prepareStatement(Queries.viewAll);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				EmpUtil.viewLogger().trace("row found");
				emp = new Emp();
				emp.setEmpId(rs.getInt("emp_id"));
				emp.setEmpName(rs.getString("emp_name"));
				emp.setEmpSal(rs.getDouble("emp_sal"));
				emp.setDept(rs.getString("emp_dept"));
				emp.setDoj(rs.getDate("emp_doj"));
				elist.add(emp);
			}
			EmpUtil.viewLogger().debug("size " + elist.size());
		} catch (SQLException e) {
			EmpUtil.viewLogger().error(e.getMessage());
		} finally {
			closeConn(conn);
		}

		if (elist.size() == 0)
			throw new NotFoundException("no employee found");
		return elist;
	}

	/**
	 * this method views all the employees for the given empID
	 * 
	 * @param eid
	 *            - Employee ID
	 * @return Emp - returns list of Emp Instances
	 * @throws throws
	 *             NOT found exception if no row found.
	 * @see viewEmployees(), viewEmployees(String)
	 *
	 */
	@Override
	public Emp viewEmployees(int eid) throws NotFoundException {
		Emp emp = null;
		Connection conn = getConn();
		try {
			PreparedStatement st = conn.prepareStatement(Queries.viewbyid);
			st.setInt(1, eid);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				EmpUtil.viewLogger().trace("row found");
				emp = new Emp();
				emp.setEmpId(rs.getInt("emp_id"));
				emp.setEmpName(rs.getString("emp_name"));
				emp.setEmpSal(rs.getDouble("emp_sal"));
				emp.setDept(rs.getString("emp_dept"));
				emp.setDoj(rs.getDate("emp_doj"));

			}
		} catch (SQLException e) {
			EmpUtil.viewLogger().error(e.getMessage());
		}
		if (emp == null)
			throw new NotFoundException("no row found");
		EmpUtil.viewLogger().debug("row found");
		return emp;
	}

	/**
	 * this method views all the employees for the given department
	 * 
	 * @param dept
	 *            - department name
	 * @return List<Emp> - returns list of Emp Instances
	 * @throws throws
	 *             NOT found exception if no row found.
	 * @see viewEmployees(), viewEmployees(String)
	 *
	 */
	@Override
	public List<Emp> viewEmployees(String dept) throws NotFoundException {
		List<Emp> elist = new ArrayList<Emp>();
		Connection conn = getConn();
		Emp emp = null;
		try {
			PreparedStatement st = conn.prepareStatement(Queries.viewbydept);
			st.setString(1, dept);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				EmpUtil.viewLogger().trace("row found");
				emp = new Emp();
				emp.setEmpId(rs.getInt("emp_id"));
				emp.setEmpName(rs.getString("emp_name"));
				emp.setEmpSal(rs.getDouble("emp_sal"));
				emp.setDept(rs.getString("emp_dept"));
				emp.setDoj(rs.getDate("emp_doj"));
				elist.add(emp);
			}
			EmpUtil.viewLogger().debug("size " + elist.size());
		} catch (SQLException e) {
			EmpUtil.viewLogger().error(e.getMessage());
		} finally {
			closeConn(conn);
		}

		if (elist.size() == 0)
			throw new NotFoundException("no employee found");
		return elist;
	}

}
