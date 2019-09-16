# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package provides an implementation of a 2D costmap that takes in sensor     data from the world, builds a 2D or 3D occupancy grid of the data (depending     on whether a voxel based implementation is used), and inflates costs in a     2D costmap based on the occupancy grid and a user specified inflation radius.     This package also provides support for map_server based initialization of a     costmap, rolling window based costmaps, and parameter based subscription to     and configuration of sensor topics."
AUTHOR = "Michael Ferguson <mfergs7@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation2"
ROS_BPN = "nav2_costmap_2d"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    laser-geometry \
    map-msgs \
    message-filters \
    nav-msgs \
    nav2-common \
    nav2-dynamic-params \
    nav2-msgs \
    nav2-util \
    nav2-voxel-grid \
    pcl \
    pluginlib \
    rclcpp \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    laser-geometry \
    map-msgs \
    message-filters \
    nav-msgs \
    nav2-dynamic-params \
    nav2-msgs \
    nav2-util \
    nav2-voxel-grid \
    pcl \
    pluginlib \
    rclcpp \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    laser-geometry \
    map-msgs \
    message-filters \
    nav-msgs \
    nav2-dynamic-params \
    nav2-msgs \
    nav2-util \
    nav2-voxel-grid \
    pcl \
    pluginlib \
    rclcpp \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing \
    nav2-map-server \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_costmap_2d/0.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ba8ab96c1dd60c028e59b2d80368aaae"
SRC_URI[sha256sum] = "d334601046ce22f40bb0abe4f43ec89531f3a21890d4e678e98b4e3289fba330"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_costmap_2d-0.1.7-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('navigation2', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('navigation2', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation2/navigation2_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation2/navigation2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation2/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
